require 'sirius/win32/core/combobox/ComboBoxService.rb'
require 'soap/mapping'

module Sirius  module Client    module Win32      module Core        module Combobox
          module ComboBoxServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
            LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
            NsControlsClassesWin32ServerSiriusOrg = "http:controls.classes.win32.server.sirius.org/"
            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetEditSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetEditSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetEditSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetEditSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindStringExact,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExact"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindStringExactResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExactResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetExtendedUI,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetExtendedUI"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetExtendedUIResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetExtendedUIResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ResetContent,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ResetContent"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ResetContentResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ResetContentResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetTextLength,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLength"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetTextLengthResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLengthResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetDroppedState,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetDroppedState"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetDroppedStateResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetDroppedStateResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetItemHeight,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetItemHeight"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetItemHeightResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetItemHeightResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCount,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCountResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindItemData,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindItemData"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["Sirius::Client::Win32::Core::Combobox::Lparam", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::Lparam,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lparam"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "longPTR"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::LongPTR,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "longPTR"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "integerType"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindItemDataResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindItemDataResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetEditSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetEditSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetEditSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetEditSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SelectString,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SelectStringResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemHeight,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeight"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemHeightResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeightResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetText,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetTextResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindString,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindStringResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ShowDropdown,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ShowDropdown"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ShowDropdownResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ShowDropdownResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetText,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetTextResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetTextResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemData,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemData"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemDataResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemDataResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBText,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBTextResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBTextLen,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBTextLen"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBTextLenResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBTextLenResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetEditSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetEditSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetEditSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetEditSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindStringExact,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExact"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindStringExactResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExactResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetExtendedUI,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetExtendedUI"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetExtendedUIResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetExtendedUIResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ResetContent,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ResetContent"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ResetContentResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ResetContentResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetTextLength,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLength"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetTextLengthResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLengthResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetDroppedState,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetDroppedState"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetDroppedStateResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetDroppedStateResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetItemHeight,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetItemHeight"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetItemHeightResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetItemHeightResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCount,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCountResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindItemData,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindItemData"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["Sirius::Client::Win32::Core::Combobox::Lparam", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::Lparam,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lparam"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "longPTR"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::LongPTR,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "longPTR"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "integerType"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindItemDataResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindItemDataResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetEditSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetEditSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetEditSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetEditSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SelectString,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SelectStringResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemHeight,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeight"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemHeightResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeightResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetText,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetTextResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindString,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindStringResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ShowDropdown,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ShowDropdown"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ShowDropdownResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ShowDropdownResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetText,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetTextResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetTextResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemData,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemData"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemDataResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemDataResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBText,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBTextResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBTextLen,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBTextLen"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBTextLenResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBTextLenResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindItemData,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindItemData"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["Sirius::Client::Win32::Core::Combobox::Lparam", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindItemDataResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindItemDataResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindString,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindStringExact,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExact"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindStringExactResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExactResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::FindStringResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCount,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCountResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCurSel,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetCurSelResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetDroppedState,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetDroppedState"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetDroppedStateResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetDroppedStateResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetEditSel,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetEditSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetEditSelResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetEditSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetExtendedUI,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetExtendedUI"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetExtendedUIResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetExtendedUIResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemData,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemData"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemDataResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemDataResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemHeight,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeight"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetItemHeightResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeightResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBText,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBTextLen,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBTextLen"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBTextLenResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBTextLenResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetLBTextResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetLBTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetText,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetTextLength,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLength"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetTextLengthResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLengthResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::GetTextResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ResetContent,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ResetContent"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ResetContentResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ResetContentResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SelectString,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SelectStringResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetCurSel,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetCurSelResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetEditSel,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetEditSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetEditSelResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetEditSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetItemHeight,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetItemHeight"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetItemHeightResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetItemHeightResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetText,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::SetTextResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetTextResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ShowDropdown,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ShowDropdown"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Combobox::ShowDropdownResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "ShowDropdownResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )
          end

        end
      end
    end
  end
end