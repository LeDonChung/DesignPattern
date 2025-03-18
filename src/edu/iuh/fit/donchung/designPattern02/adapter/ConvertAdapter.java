package edu.iuh.fit.donchung.designPattern02.adapter;

public class ConvertAdapter implements XMLTarget{

    private JSONAdaptee jsonAdaptee = new JSONAdaptee();
    @Override
    public void request(String xml) {
        System.out.println("XML request: " + xml);
        String json = convertXMLtoJSON(xml);
        jsonAdaptee.specificRequest(json);
    }

    private String convertXMLtoJSON(String xml){
        System.out.println("Converted.");
        return "{hoTen: 'Don Chung', tuoi: 21, diaChi: 'HCMC'}";
    }
}
