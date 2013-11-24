require 'SpinService.rb'
require 'soap/mapping'
module Sirius
module Client
module Win32
module Core
module Spin

module SpinServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
  LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
  NsControlsClassesWin32ServerSiriusOrg = "http:controls.classes.win32.server.sirius.org/"
  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::Decrement,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "decrement"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::DecrementResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "decrementResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetPosition,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetPositionResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPositionResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetText,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetTextResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setTextResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetPosition,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPDouble", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetPositionResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPositionResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLargeStep,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLargeStep"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLargeStepResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLargeStepResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetSmallStep,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSmallStep"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetSmallStepResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSmallStepResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLowerBound,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLowerBoundResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetUpperBound,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetUpperBoundResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetText,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetTextResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::Increment,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "increment"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::IncrementResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "incrementResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::Decrement,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "decrement"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::DecrementResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "decrementResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetPosition,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetPositionResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPositionResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetText,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetTextResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setTextResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetPosition,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPDouble", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetPositionResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPositionResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLargeStep,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLargeStep"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLargeStepResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLargeStepResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetSmallStep,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSmallStep"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetSmallStepResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSmallStepResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLowerBound,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLowerBoundResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetUpperBound,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetUpperBoundResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetText,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetTextResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::Increment,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "increment"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::IncrementResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "incrementResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::Decrement,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "decrement"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::DecrementResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "decrementResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLargeStep,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLargeStep"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLargeStepResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLargeStepResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLowerBound,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetLowerBoundResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLowerBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetPosition,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetPositionResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPositionResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetSmallStep,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSmallStep"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetSmallStepResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSmallStepResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetText,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetTextResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetUpperBound,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBound"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::GetUpperBoundResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getUpperBoundResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPDouble", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::Increment,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "increment"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::IncrementResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "incrementResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetPosition,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPosition"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPDouble", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetPositionResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPositionResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetText,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Spin::SetTextResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setTextResponse"),
    :schema_element => []
  )
end

end
end
end
end
end