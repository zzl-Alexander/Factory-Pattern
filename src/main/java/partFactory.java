public class partFactory {
    public Part_prodection getPart(String partType){
        if(partType==null)return null;
        if(partType.equals("电池"))return new Battery();
        if(partType.equals("CPU"))return new CPU();
        if(partType.equals("内存"))return new Memory();
        return null;
    }
}
