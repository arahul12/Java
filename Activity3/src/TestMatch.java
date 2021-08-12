
class TestMatch extends Match
{
	public TestMatch(int currentScore, float currentOver, int target) {
		super(currentScore, currentOver, target);
		// TODO Auto-generated constructor stub
	}

	private int overs=90;

	@Override
	public float calculateRunRate() {
		int req=this.getTarget()-this.getCurrentscore();
		int overs=(int) (this.overs-this.getCurrentover());
		
		return (float)req/overs;
	}

	@Override
	public int calculateBalls() {
		int balls=(this.overs-(int)this.getCurrentover())*6;
		return balls;
		
	}

	@Override
	public void display(double reqRunrate, int balls) {
		
		System.out.println("Need " + (int)(balls/6)*reqRunrate + " runs in" + balls + "balls");
		System.out.println("Required runrate:" + reqRunrate);
	}

}