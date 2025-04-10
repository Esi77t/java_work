package ex05_enum;

public enum Operation {
	PLUS {
		@Override
		int apply(int x, int y) {
			// TODO Auto-generated method stub
			return x + y;
		}
	},
	MINUS {
		@Override
		int apply(int x, int y) {
			// TODO Auto-generated method stub
			return x - y;
		}
	},
	MULTI {
		@Override
		int apply(int x, int y) {
			// TODO Auto-generated method stub
			return x * y;
		}
	},
	DIV {
		@Override
		int apply(int x, int y) {
			// TODO Auto-generated method stub
			return x / y;
		}
	};
	
	abstract int apply(int x, int y);
}
