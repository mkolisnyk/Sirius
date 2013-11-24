require 'SliderService.rb'
require 'soap/mapping'
module Sirius
module Client
module Win32
module Core
module Slider

module SliderServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
  LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
  NsControlsClassesWin32ServerSiriusOrg = "http:controls.classes.win32.server.sirius.org/"
  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::SetPosition,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPDouble", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::SetPositionResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPositionResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetPosition,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetPositionResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPositionResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetUpperBound,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetUpperBoundResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetLowerBound,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetLowerBoundResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::SetPosition,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPDouble", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::SetPositionResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPositionResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetPosition,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetPositionResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPositionResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetUpperBound,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetUpperBoundResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetLowerBound,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetLowerBoundResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetLowerBound,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetLowerBoundResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetPosition,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetPositionResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPositionResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetUpperBound,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::GetUpperBoundResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::SetPosition,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPDouble", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Slider::SetPositionResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPositionResponse"),
    :schema_element => []
  )
end

end
end
end
end
end