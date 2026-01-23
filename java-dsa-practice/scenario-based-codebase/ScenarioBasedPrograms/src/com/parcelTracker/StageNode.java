package com.parcelTracker;

public class StageNode {
    String stageName;
    StageNode next;

    StageNode(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }
}

 class Checkpoint{
	 private StageNode head;
	 
	 public void addStageAtEnd(String stageName) {
		 StageNode newNode= new StageNode(stageName);
		 
		 if (head==null) {
			 head = newNode;
			 return;
		}
		StageNode temp = head; 
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next=newNode;	 
	 }
	 
	 public void addCheckpointAfter(String existingStage, String newStage) {
	        StageNode temp = head;

	        while (temp != null && !temp.stageName.equals(existingStage)) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Stage not found. Cannot add checkpoint.");
	            return;
	        }

	        StageNode checkpoint = new StageNode(newStage);
	        checkpoint.next = temp.next;
	        temp.next = checkpoint;
	    }

	    // Forward tracking through stages
	    public void trackParcel() {
	        if (head == null) {
	            System.out.println("Parcel lost: No tracking data available.");
	            return;
	        }

	        StageNode temp = head;
	        System.out.print("Parcel Status: ");

	        while (temp != null) {
	            System.out.print(temp.stageName);
	            if (temp.next != null)
	                System.out.print(" --> ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    // Handle missing parcel
	    public void checkParcelStatus() {
	        if (head == null) {
	            System.out.println("Parcel missing..!!!");
	        } else {
	            System.out.println("Tracking For the Parcel is Completed.");
	        }
	    }
	}
