package edu.cpp.cs240.stack;

public class Test {

	private class MyStack implements IntStack {

		@Override
		public int peek() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int pop() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void push(int value) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

	}
	public static void main(String[] args) {


		IntStack stack = new IntStack() {

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 5;
			}

			@Override
			public void push(int value) {
				// TODO Auto-generated method stub

			}

			@Override
			public int pop() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int peek() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
		};

	}

}
