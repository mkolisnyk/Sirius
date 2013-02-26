require 'ButtonService.rb'
require 'soap/mapping'

module Sirius  module Client    module Win32      module Core        module Button
          module ButtonServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
            LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
            NsControlsClassesWin32ServerSiriusOrg = "http:controls.classes.win32.server.sirius.org/"
            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetState,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetState"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetStateResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetStateResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetCheck,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCheck"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetCheckResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCheckResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetState,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetState"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetStateResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetStateResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetCheck,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCheck"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetCheckResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCheckResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetState,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetState"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetStateResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetStateResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetCheck,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCheck"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetCheckResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCheckResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetState,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetState"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetStateResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetStateResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetCheck,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCheck"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetCheckResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCheckResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetCheck,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCheck"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetCheckResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCheckResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetState,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetState"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::GetStateResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetStateResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetCheck,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCheck"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetCheckResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCheckResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetState,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetState"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Button::SetStateResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetStateResponse"),
            :schema_element => []
            )
          end

        end
      end
    end
  end
end