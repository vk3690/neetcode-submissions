class DynamicArray {

    int[] arr;
    int capacity;
    int size;

    public DynamicArray(int capacity) {
        this.capacity=capacity;
        arr=new int[capacity];

    }

    public int get(int i) {
        return this.arr[i];

    }

    public void set(int i, int n) {
        this.arr[i]=n;
        // this.size++;

    }

    public void pushback(int n) {

        if(this.size==this.capacity)
        {
            this.resize();
        }
        this.arr[this.size]=n;
        this.size++;
        

    }

    public int popback() {
        System.out.println(this.size);
        int pop=this.arr[this.size-1];
        this.arr[size-1]=0;
        this.size--;
        return pop;

    }

    private void resize() {
        int[] arr=new int[this.capacity*2];
        for(int i=0;i<this.arr.length;i++)
        {
            arr[i]=this.arr[i];
        } 
        this.arr=arr;
        this.capacity=this.capacity*2;

    }

    public int getSize() {
        // System.out.println()
        return this.size;

    }

    public int getCapacity() {
 return this.capacity;
    }
}
