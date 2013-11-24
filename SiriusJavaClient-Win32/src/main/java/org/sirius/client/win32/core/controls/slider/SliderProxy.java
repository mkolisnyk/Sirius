package org.sirius.client.win32.core.controls.slider;

public class SliderProxy implements org.sirius.client.win32.core.controls.slider.Slider {
  private String _endpoint = null;
  private org.sirius.client.win32.core.controls.slider.Slider slider = null;
  
  public SliderProxy() {
    _initSliderProxy();
  }
  
  public SliderProxy(String endpoint) {
    _endpoint = endpoint;
    _initSliderProxy();
  }
  
  private void _initSliderProxy() {
    try {
      slider = (new org.sirius.client.win32.core.controls.slider.SliderServiceLocator()).getSliderPort();
      if (slider != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)slider)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)slider)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (slider != null)
      ((javax.xml.rpc.Stub)slider)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.client.win32.core.controls.slider.Slider getSlider() {
    if (slider == null)
      _initSliderProxy();
    return slider;
  }
  
  public java.lang.Double getLowerBound(java.lang.Integer arg0) throws java.rmi.RemoteException{
    if (slider == null)
      _initSliderProxy();
    return slider.getLowerBound(arg0);
  }
  
  public java.lang.Double getUpperBound(java.lang.Integer arg0) throws java.rmi.RemoteException{
    if (slider == null)
      _initSliderProxy();
    return slider.getUpperBound(arg0);
  }
  
  public java.lang.Double getPosition(java.lang.Integer arg0) throws java.rmi.RemoteException{
    if (slider == null)
      _initSliderProxy();
    return slider.getPosition(arg0);
  }
  
  public void setPosition(java.lang.Integer arg0, java.lang.Double arg1) throws java.rmi.RemoteException{
    if (slider == null)
      _initSliderProxy();
    slider.setPosition(arg0, arg1);
  }
  
  
}