//package be.vdab;
//
//import be.vdab.domain.RijksregisterNummer;
//
//import javax.faces.application.FacesMessage;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.ConverterException;
//import javax.faces.convert.FacesConverter;
//
///**
// * Created by Evelyne on 01/07/15.
// */
//
//@FacesConverter
//public class RijksregisterConverter implements Converter{
//
//
//    @Override
//    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
//        if(notRight)    {
//            throw new ConverterException(new FacesMessage("rijksregisternummer is in het foute formaat ingegeven"));
//        }
//        return new RijksregisterNummer(1,2,3,4,5);
//    }
//
//    @Override
//    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
//        return value.toString();
//    }
//}
