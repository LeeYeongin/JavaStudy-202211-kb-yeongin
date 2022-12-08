package No2_2;

class Factory {

    private String factoryName;

    private static Factory instance = null;

    

    public static Factory getInstance() {

        if(instance == null) {

            instance = new Factory();

        }

        return instance;

    }

}