package Maps;

import java.util.Arrays;

public class Dynarr<T> {
	private final int sizeEl = 2;
	private Object[] arr;
	private int count;
	private int size;

	Dynarr() {
		arr = new Object[sizeEl];
		count = 0;
		size = sizeEl;
	}

	Dynarr(T el) {
		arr = new Object[sizeEl];
		arr[0] = el;
		count = 1;
		size = sizeEl;
	}

	public Object[] getArr() {
		return arr;
	}

	public int getCount() {
		return count;
	}

	public int getSize() {
		return size;
	}

	// dostup do
	public void add(T el) {
		if (count >= 0 && count < size) {
			arr[count] = el;
			count++;
		} else if (count >= size) {
			Object[] arrNew = new Object[size + sizeEl];
			for (int i = 0; i < count; i++) {
				arrNew[i] = arr[i];
			}
			arrNew[count] = el;
			count++;
			size = size + sizeEl;
			arr = new Object[arrNew.length];
			arr = arrNew;
		}

	}

	public T getEl(int index) {
		if (index >= count)
			throw new ArrayIndexOutOfBoundsException("Wrong");
		return (T) arr[index];
	}
	
	public T delEl(){
		T dell = (T)arr[count-1];
		arr[count-1]=null;
		count--;
		return dell;
	}

	@Override
	public String toString() {
		if (arr[arr.length - 1]==null) {
			Object[] arrNew = new Object[arr.length - 1];
			for (int i = 0; i < arrNew.length; i++) {
				arrNew[i] = arr[i];
			}
			return Arrays.toString(arrNew);
		}
		return Arrays.toString(arr);

	}
}
