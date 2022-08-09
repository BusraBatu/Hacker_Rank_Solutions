package Challange.Advanced;

class JavaSingletonPattern {
    public String str;
    public static final JavaSingletonPattern instance = null;

    private JavaSingletonPattern() {

    }

    public static JavaSingletonPattern getSingleInstance() {
        if (instance == null)
            return new JavaSingletonPattern();
        return instance;
    }
}
