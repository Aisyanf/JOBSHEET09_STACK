public class StackSurat02 {
    Surat02 [] stack;
    int top;
    int size;

    public StackSurat02 (int size) {
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat02 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat02 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public void cari(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                ketemu = true;
                System.out.println("Surat ditemukan dari " + nama);
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Surat tidak ditemukan");
        }
    }
}
