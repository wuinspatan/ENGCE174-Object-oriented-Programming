# Run Java single-file programs in directories L1.1, L1.2, etc.
# Usage:
#   make L1      (runs java L1.1/Main.java)
#   make L2      (runs java L1.2/Main.java)
#   make L1.3    (runs java L1.3/Main.java)
#   make help    (shows this help message)

.PHONY: help L1 L2 L3 L4 L5 L6 L7 L8 L9 L10 L11 L12 L13 L14 L15 L16 L17 L18 L19 L20 l1 l2 l3 l4 l5 l6 l7 l8 l9 l10 l11 l12 l13 l14 l15 l16 l17 l18 l19 l20

# Default action is to show help
default: help

# Explicit targets for easy tab-completion and clarity
L1 l1:
	java L1.1/Main.java

L2 l2:
	java L1.2/Main.java

L3 l3:
	java L1.3/Main.java

L4 l4:
	java L1.4/Main.java

L5 l5:
	java L1.5/Main.java

L6 l6:
	java L1.6/Main.java

L7 l7:
	java L1.7/Main.java

L8 l8:
	java L1.8/Main.java

L9 l9:
	java L1.9/Main.java

L10 l10:
	java L1.10/Main.java

L11 l11:
	java L1.11/Main.java

L12 l12:
	java L1.12/Main.java

L13 l13:
	java L1.13/Main.java

L14 l14:
	java L1.14/Main.java

L15 l15:
	java L1.15/Main.java

L16 l16:
	java L1.16/Main.java

L17 l17:
	java L1.17/Main.java

L18 l18:
	java L1.18/Main.java

L19 l19:
	java L1.19/Main.java

L20 l20:
	java L1.20/Main.java

# Generic fallback pattern rule to support any future L1.X or LX.Y directory automatically
# e.g., 'make L1.5' or 'make L6' or 'make L2.1'
L% l%:
	@if [ -f "L1.$*/Main.java" ]; then \
		java L1.$*/Main.java; \
	elif [ -f "L$*/Main.java" ]; then \
		java L$*/Main.java; \
	else \
		echo "Error: Main.java not found in L1.$* or L$*"; \
		exit 1; \
	fi

help:
	@echo "Available commands:"
	@echo "  make L1      - Run java L1.1/Main.java"
	@echo "  make L2      - Run java L1.2/Main.java"
	@echo "  ... (up to L20)"
	@echo "  make L20     - Run java L1.20/Main.java"
	@echo "  make L<num>  - Run java L1.<num>/Main.java (e.g., make L1.5)"
