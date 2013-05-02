require 'sirius/win32/core/dialog/DialogService.rb'
require 'soap/mapping'

module Sirius  module Client    module Win32      module Core        module Dialog
          module DialogServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
            LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
            NsClassesWin32ServerSiriusOrg = "http://classes.win32.server.sirius.org/"
            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemText,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemTextResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItem,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItem"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgCtrlID,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgCtrlID"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgCtrlIDResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgCtrlIDResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemInt,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemInt"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg3")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemIntResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemIntResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemInt,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemInt"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg3")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemIntResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemIntResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDialogBaseUnits,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDialogBaseUnits"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDialogBaseUnitsResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDialogBaseUnitsResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemTextA,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemTextA"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemTextAResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemTextAResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::IsDlgButtonChecked,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isDlgButtonChecked"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::IsDlgButtonCheckedResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isDlgButtonCheckedResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemText,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemTextResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItem,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItem"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgCtrlID,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgCtrlID"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgCtrlIDResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgCtrlIDResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemInt,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemInt"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg3")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemIntResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemIntResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemInt,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemInt"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg3")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemIntResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemIntResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDialogBaseUnits,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDialogBaseUnits"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDialogBaseUnitsResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDialogBaseUnitsResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemTextA,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemTextA"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemTextAResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemTextAResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::IsDlgButtonChecked,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isDlgButtonChecked"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::IsDlgButtonCheckedResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isDlgButtonCheckedResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDialogBaseUnits,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDialogBaseUnits"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDialogBaseUnitsResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDialogBaseUnitsResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgCtrlID,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgCtrlID"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgCtrlIDResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgCtrlIDResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItem,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItem"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemInt,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemInt"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg3")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemIntResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemIntResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemTextA,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemTextA"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::GetDlgItemTextAResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getDlgItemTextAResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::IsDlgButtonChecked,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isDlgButtonChecked"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::IsDlgButtonCheckedResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isDlgButtonCheckedResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemInt,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemInt"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg3")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemIntResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemIntResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemText,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Dialog::SetDlgItemTextResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "setDlgItemTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )
          end

        end
      end
    end
  end
end