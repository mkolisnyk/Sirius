require 'ButtonService.rb'
require 'soap/mapping'
module Sirius
module Client
module Win32
module Core
module Button

module ButtonServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
  LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
  NsControlsClassesWin32ServerSiriusOrg = "http:controls.classes.win32.server.sirius.org/"
  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetState,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getState"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetStateResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getStateResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsChecked,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isChecked"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsCheckedResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isCheckedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetCheck,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setCheck"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetCheckResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setCheckResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsPushed,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isPushed"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsPushedResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isPushedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetState,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setState"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetStateResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setStateResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsIntermediate,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isIntermediate"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsIntermediateResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isIntermediateResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetCheck,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getCheck"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetCheckResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getCheckResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetState,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getState"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetStateResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getStateResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsChecked,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isChecked"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsCheckedResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isCheckedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetCheck,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setCheck"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetCheckResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setCheckResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsPushed,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isPushed"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsPushedResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isPushedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetState,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setState"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetStateResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setStateResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsIntermediate,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isIntermediate"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsIntermediateResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isIntermediateResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetCheck,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getCheck"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetCheckResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getCheckResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetCheck,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getCheck"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetCheckResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getCheckResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetState,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getState"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::GetStateResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getStateResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsChecked,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isChecked"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsCheckedResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isCheckedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsIntermediate,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isIntermediate"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsIntermediateResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isIntermediateResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsPushed,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isPushed"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::IsPushedResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "isPushedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetCheck,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setCheck"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetCheckResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setCheckResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetState,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setState"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Button::SetStateResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setStateResponse"),
    :schema_element => []
  )
end

end
end
end
end
end