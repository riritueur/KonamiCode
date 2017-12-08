
public class App {
	public int[] orders = {3,5,0,1,4,2,7,8,6};
	private boolean completed = false;
	
	public void click(int a){
		if(a == 1){
			if(orders[1] == 0){
				reverse(1,2);
			}
			if(orders[3] == 0){
				reverse(1,4);
			}
		}
		if(a == 2){
			if(orders[0] == 0){
				reverse(1,2);
			}
			if(orders[4] == 0){
				reverse(5,2);
			}
			if(orders[2] == 0){
				reverse(3,2);
			}
		}
		if(a == 3){
			if(orders[1] == 0){
				reverse(3,2);
			}
			if(orders[5] == 0){
				reverse(6,3);
			}
		}
		if(a == 4){
			if(orders[0] == 0){
				reverse(1,4);
			}
			if(orders[4] == 0){
				reverse(5,4);
			}
			if(orders[6] == 0){
				reverse(7,4);
			}
		}
		if(a == 5){
			if(orders[1] == 0){
				reverse(5,2);
			}
			if(orders[3] == 0){
				reverse(5,4);
			}
			if(orders[5] == 0){
				reverse(5,6);
			}
			if(orders[7] == 0){
				reverse(5,8);
			}
		}
		if(a == 6){
			if(orders[2] == 0){
				reverse(3,6);
			}
			if(orders[4] == 0){
				reverse(5,6);
			}
			if(orders[8] == 0){
				reverse(9,6);
			}
		}
		if(a == 7){
			if(orders[3] == 0){
				reverse(4,7);
			}
			if(orders[7] == 0){
				reverse(8,7);
			}
		}
		if(a == 8){
			if(orders[4] == 0){
				reverse(5,8);
			}
			if(orders[6] == 0){
				reverse(7,8);
			}
			if(orders[8] == 0){
				reverse(9,8);
			}
		}
		if(a == 9){
			if(orders[7] == 0){
				reverse(8,9);
			}
			if(orders[5] == 0){
				reverse(6,9);
			}
		}
	}
	
	public void reverse(int a, int b){
		int tmp = orders[a-1];
		orders[a-1] = orders[b-1];
		orders[b-1] = tmp;
		if(isordered()){
			complete();
		}
	}
	
	public boolean isordered(){
		for(int i=1; i<orders.length;i++){
			if(i != orders[i-1])
				return false;
		}
		if(orders[8] == 0)
			return true;
		else
			return false;
	}
	
	public void complete(){completed = true;}
	public boolean isCompleted(){return completed;}
	
	public String toString(){
		String res = " --- ";
		for(int i=0; i<orders.length;i++)
			res += Integer.toString(orders[i]);
		return res;
	}
}
