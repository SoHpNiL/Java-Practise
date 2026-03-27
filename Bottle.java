public class Bottle {
	int capacity;
	int contents = 0;


	public Bottle(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public int getCurrentLiquidAmount() {
		return this.contents;
	}

	public void fill(int amount) {
		if (amount < 0){
			System.out.println("Invalid amount!");
			return;
		}

		this.contents = amount + this.contents;
		if (this.contents > this.capacity){
			System.out.println("Bottle overflowed!");
			this.contents = this.capacity;
		}
	}

	public void empty() {
		this.contents = 0;
	}

	public void pourInto(Bottle other) {
		other.fill(this.contents);
		this.contents = 0;
	}
}