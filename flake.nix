{
  description = "Java OOP Learning Lab — ENGCE174";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs = { self, nixpkgs, flake-utils }:
    flake-utils.lib.eachDefaultSystem (system:
      let
        pkgs = nixpkgs.legacyPackages.${system};
      in {
        devShells.default = pkgs.mkShell {
          name = "java-oop-lab";

          packages = with pkgs; [
            # Java 21 LTS
            jdk21

            # Code formatter
            google-java-format

            # Useful CLI tools
            git
          ];

          # Set JAVA_HOME automatically
          JAVA_HOME = "${pkgs.jdk21}";

          # Aliases for common tasks
          shellHook = ''
            # Make google-java-format easier to use
            alias fmt="google-java-format --replace"
            alias fmtall='find . -name "*.java" | xargs google-java-format --replace'

            # Quick compile + run helper
            # Usage: jrun Main.java
            function jrun() {
              java "$1"
            }
          '';
        };
      }
    );
}
