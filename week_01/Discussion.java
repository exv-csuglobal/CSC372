class MedicalCondition {
    private String name;
    private boolean isChronic;

    public MedicalCondition (String name, boolean isChronic) {
        this.name = name;
        this.isChronic = isChronic;
    }

    public String getName(){
        return name;
    }

    public boolean getChronic(){
        return isChronic;
    }

}

class Blindness extends MedicalCondition{
    private String AffectedEye;

    public Blindness (String name, boolean isChronic,String String AffectedEye) {
        super(name, isChronic);
        this.AffectedEye = AffectedEye
    }

    public String getAffectedEye(){
        return AffectedEye
    }

}