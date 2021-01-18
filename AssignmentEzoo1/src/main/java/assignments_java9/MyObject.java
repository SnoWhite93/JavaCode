package assignments_java9;

public class MyObject {

    private long id;

    public MyObject() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyObject) {
            MyObject that = (MyObject) obj;
            if (this.id == that.id) {
                return true;
            }
        }
        return false;
    }

}
