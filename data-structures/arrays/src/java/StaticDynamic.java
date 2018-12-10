public class StaticDynamic {
    
    // total number of spaces avaiable
    private int mCapacity = 0;
    // size is the total numnber of elements within the memory
    // space.
    private int mSize = 0;
    private int [] mArray = null;

    public StaticDynamic(int startCapacity) {
        // error checking
        if (startCapacity < 1) {
            throw new java.lang.IllegalArgumentException("");
        }

        this.mArray = new int [startCapacity];
        this.mCapacity = this.mArray.length;
        this.mSize = 0;
    }

    public void printArray() {
        for (int num : this.mArray) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    // add new elements
    public void addNewElement(int newData) {
        // case 1 - mArray null or length < 1
        if (this.mArray == null || this.mArray.length < 1) {
            throw new java.lang.IllegalStateException("");
        }

        // case 2 - array capacity is not full.
        if (this.mSize < this.mCapacity) {
            this.mArray[this.mSize] = newData;
            this.mSize++;
        }
        else {
            // case 3 - no capacity remaining.
            // 1 + 2 + 3 + 4 + ... + N - 2 + N - 1 + N
            int [] newArray = new int [this.mCapacity + 1];
            // maybe increment by powers of two
            // capacity 8 when full the new capacity is 16

            // I need to send 64 MB for UDP
            // 0x40000
            // 1 << 3 == 8 == 0b0000000001 <=> 0b0000001000
            
            List <Integer> dataToSend = new ArrayList<>(1 << 18);
            // uses default block size of i think 16 bytes
            for (int index = 0; index < (1 << 18); index++) {
                // bytes 0 - 7 are okay no new capacity
                // bytes 8 - 15 new capacity of 16 copy at byte 8 of bytes 0 through 7 to the new buffer
                // bytes 16 - 31 new capacity of 32 copy at byte 16 of bytes 0 through 15 to the new buffer
                
                dataToSend.add(index);
            }

            // copy data over to the new array.
            // O(N)
            int index = 0;
            for (int num : this.mArray) {
                newArray[index] = num;
                index++;
            }
            // add the new data
            newArray[index] = newData;

            // swap & update
            this.mArray = newArray;
            this.mSize = index + 1;
            this.mCapacity = newArray.length;
        }
    }

    public int removeLast() {
        // error checking.
        if (this.mSize < 1 || this.mArray == null) {
            throw new java.lang.IllegalStateException("");
        }

        int last = this.mArray[this.mArray.length - 1];

        if (this.mCapacity - 1 == 0) {
            this.mArray = null;
            return last;
        }

        int [] newArray = new int [this.mCapacity - 1];
        for (int index = 0; index < newArray.length; index++) {
            newArray[index] = this.mArray[index];
        }
    
        // swap & update
        this.mArray = newArray;
        this.mSize = newArray.length;
        this.mCapacity = newArray.length;
    }

    public int removeAtIndex(int index) {
        // but copy except at the specified index
    }

    public int removeFirst() {
        
    }

    // find an element
    public boolean find(int data) {
        // error checking

        // find the first through iteration
        for (int num : this.mArray) {
            if (num == data) {
                return true;
            }
        }

        return false;
    }

    // get element at index
    public int getAtIndex(int index) {
        // error checking
        if (index >= 0 && index < this.mCapacity) {
            return this.mArray[index];
        }
        else {
            throw new java.lang.IllegalArgumentException("");
        }
    }
    
    public int size() {
        return this.mSize;
    }

    public int capacity() {
        return this.mCapacity;
    }

    public static void main(String [] args) {
        // static
        // 40 bytes
        int [] data = new int [10];
        // 16 bytes
        int [] data2 = new int [] {1,2,3,4};

        // iterate
        for (int num : data) {

        }

        // modify
        data[0] = 1;

        // exception expected
        // 80 bytes
        // data[20] = 5;
        // data[-1] = 5;

        // really the beginning of dynamic arrays.
        int [] data3 = new int [20];
        int index = 0;
        for (int num : data) {
            data3[index] = num;
            index++;
        }
        data3[19] = 5;
        data = data3;

        StaticDynamic staticDynamic = new StaticDynamic(10);
        assert (staticDynamic.size() == 0);
        assert (staticDynamic.capacity() == 10);
        staticDynamic.addNewElement(5);
        assert (staticDynamic.size() == 1);
        assert (staticDynamic.capacity() == 10);

        for (index = 0; index < 1000; index++) {
            staticDynamic.addNewElement(index);
            assert (staticDynamic.size() == index + 2);
            if (index < 9) {
                assert (staticDynamic.capacity() == 10);
            }
            else {
                assert (staticDynamic.capacity() == index + 2);
            }
        }
    }
}