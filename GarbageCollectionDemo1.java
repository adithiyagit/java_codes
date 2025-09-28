public class GarbageCollectionDemo1 {
    String name;

    GarbageCollectionDemo1(String name) {
        this.name = name;
    }

    // Simulate cleanup instead of finalize()
    public void cleanup() {
        System.out.println("Cleaning up object: " + name);
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        GarbageCollectionDemo1 obj1 = new GarbageCollectionDemo1("Object1");
        GarbageCollectionDemo1 obj2 = new GarbageCollectionDemo1("Object2");

        // Explicit cleanup before losing reference
        obj1.cleanup();
        obj1 = null;

        obj2.cleanup();
        obj2 = new GarbageCollectionDemo1("Object3");

        // Request GC (may not run immediately)
        System.gc();

        System.out.println("End of main method");
    }
}
