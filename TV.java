
public class TV {
	State offState;
	State onState;
	State muteState;
	//State changeChannel;
	//State volumeUp;
	//State volumeDown;

	State state;

	public TV() {
		offState = new OffState(this);
		onState = new OnState(this);
		muteState = new MuteState(this);
		//changeChannel = new ChangeChannel(this);
		
	}

	public void muteState() {
		state.muteState();
	}

	public void volumeUp() {
		state.volumeUp();
	}
	
	public void volumeDown() {
		state.volumeDown();
	}
	
	public void onState() {
		state.onState();
	}
	
	public void offState() {
		state.offState();
	}
	
	public void changeChannel() {
		state.changeChannel();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
    public State getState() {
        return state;
    }

}