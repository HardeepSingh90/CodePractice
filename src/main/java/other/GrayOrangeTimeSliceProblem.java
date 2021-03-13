package other;

class GrayOrangeTimeSliceProblem
{
	public static void result(int[] jobs,int arrivalTimeArr,int contextSwitch2,int timeSlice){
		arrivalTimeArr= 0;
		int waitingTime;
		int turnAroundTime;
		int responseTime;
		int[] jobs2=jobs;
		int[] executionStartAt ;
		executionStartAt = new int[jobs.length];
		int[] watingTime;
		watingTime = new int[jobs.length];
		int[] contextSwitch ;
		contextSwitch = new int[jobs.length];
		int starts=0;
		for(int temp=0;temp<jobs.length;temp++){
			if(jobs[temp] ==0)
				continue;
			else{
				for(int job=0;job<jobs.length;job++){
					int arrivalTime = 0;
					executionStartAt[job] = starts;//holding response time
					starts++;
					int jobValue = jobs[job];
					if((jobValue-timeSlice)<=0){
						jobs[job] = 0;

						watingTime[job] = starts;
						starts = starts +jobValue;
						contextSwitch[job] = starts;
					}
					else{
						jobs[job] = jobValue-timeSlice;

						starts = starts+contextSwitch2+timeSlice;
					}

				}

			}
		}
		for(int contextSwitchResult:contextSwitch)
			System.out.println("-----"+contextSwitchResult);
		for(int waiting:watingTime)
			System.out.println(">>>>"+waiting);
	}
	public static void main(String...s) {
		result(new int[]{ 10, 25, 67, 42, 19 }, 10, 1, 15);
	}

}

