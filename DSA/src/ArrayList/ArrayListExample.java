package ArrayList;

import java.lang.classfile.TypeAnnotation.ThrowsTarget;
import java.security.PublicKey;

public class ArrayListExample {
	Object[] objects=new Object[10];
	int count=0;
	public void add(Object ele) {
		if(count>=objects.length)
			increase();
		objects[count++]=ele;
		
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	private void increase() {
		// TODO Auto-generated method stub
		
		Object[] a=new Object[objects.length+6];
		for(int i=0;i<=objects.length;i++) {
			a[i]=objects[i];
			objects=a;
			
		}
		
	}
	public Object get(int index) {
		if(index<0||index>size()) 
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		return index;
	}
	public void addPos(Object ele,int index) {
		if(index<0||index>=size())
			throw new ArrayIndexOutOfBoundsException();
		if(count>=objects.length)
			increase();
		for(int i=size();i>index;i--)
			objects[i]=objects[i-1];
		objects[index]=ele;
		count++;
	}
	public void remove(int index) {
		if(index<0||index>=size())
			throw new ArrayIndexOutOfBoundsException();
		for(int i=index;i<size();i++)
			objects[i]=objects[i+1];
		count--;
	}

}
