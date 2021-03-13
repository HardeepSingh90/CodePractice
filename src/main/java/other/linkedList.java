package other;

public class linkedList {
//node
	/// Node1(data,next)->Node2(data,next)->Node3(data,null)
	Node head;

	class Node {
		Node(int data) {
			this.data = data;
		}

		int data;
		Node next;
	}

	public void add(int data) {
		Node node = new Node(data);
		if (this.head == null) {
			this.head = node;
		} else {
			Node temp = this.head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = node;
		}
	}

	public void show() {
		Node value = this.head;
		while (value != null) {
			System.out.println(value.data);
			value = value.next;
		}
	//	System.out.println(value.data);
	}

	public static void main(String... s) {
		linkedList linkedList = new linkedList();
		linkedList.add(5);
		linkedList.add(2);
		linkedList.show();
	}
}



//Student roll,marks,subj
//(select max(marks),subj from student group by subj);

//select * from student where rowid in (select rowid from student group by subject order by marks desc offset 1 fetch first  3 rows);



