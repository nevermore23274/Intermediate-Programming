public class BauldersGate3 extends VideoGame{
	//variables
		private String cameraType;
		private String releasePhase;

		//constructor
		BauldersGate3(String title, String genre, float price, String cameraType, String releasePhase) {
			super(title, genre, price);
			this.cameraType = cameraType;
			this.releasePhase = releasePhase;
		}

		//getter methods
		public String getCameraType() {
			return this.cameraType;
		}

		public String getReleasePhase() {
			return this.releasePhase;
		}

		//setter method 
		public void setMonthRel(String cameraType) {
			this.cameraType = cameraType;
		}

		public void setPlayerCount(String releasePhase) {
			this.releasePhase = releasePhase;
		}

		//toString
		public String toString() {
			return "Baulder's Gate 3 [title = " + getTitle() +", genre = " + getGenre() +", price = $" + getPrice() +", camera type = " + getCameraType() +", release phase = " + getReleasePhase() +"]";
		}
}
