package com.zhangliao.javabase;

public class Person {
	private String name = "张辽";
	private int age = 23;
	private boolean married = true;
	
	public Person(String str,int i,boolean flag){
		name =str;
		age = i;
		married = flag;
	}
	
	private void display() {
		System.out.println("姓名："+ name + "\n" + "年龄：" + age + "\n" + "婚否" + married);
		
	}

	public static void main(String[] args) {
		Person person = new Person("JACK",25,false);
		person.display();

	}

}
