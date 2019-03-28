public enum Country {

    FR("France"), US("United state"), GB("Grande bretagne");

    private String name;

    private Country( String name ){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
