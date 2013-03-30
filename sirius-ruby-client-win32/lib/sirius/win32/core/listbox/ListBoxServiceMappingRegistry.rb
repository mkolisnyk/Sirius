require 'ListBoxService.rb'
require 'soap/mapping'

module Sirius  module Client    module Win32      module Core        module Listbox
          module ListBoxServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
            LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
            NsControlsClassesWin32ServerSiriusOrg = "http:controls.classes.win32.server.sirius.org/"
            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCount,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCountResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindString,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindStringResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelItemRange,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelItemRange"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelItemRangeResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelItemRangeResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetText,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTextResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetItemHeight,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeight"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetItemHeightResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeightResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCaretIndex,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCaretIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCaretIndexResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCaretIndexResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelectString,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelectStringResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSelCount,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSelCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSelCountResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSelCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindStringExact,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExact"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindStringExactResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExactResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCaretIndex,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCaretIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCaretIndexResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCaretIndexResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTextLen,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLen"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTextLenResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLenResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTopIndex,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTopIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTopIndexResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTopIndexResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetHorizontalExtent,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetHorizontalExtent"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetHorizontalExtentResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetHorizontalExtentResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCount,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCountResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindString,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindStringResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelItemRange,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelItemRange"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelItemRangeResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelItemRangeResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetText,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTextResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetItemHeight,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeight"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetItemHeightResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeightResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCaretIndex,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCaretIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCaretIndexResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCaretIndexResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelectString,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelectStringResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSelCount,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSelCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSelCountResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSelCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindStringExact,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExact"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindStringExactResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExactResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCaretIndex,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCaretIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCaretIndexResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCaretIndexResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTextLen,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLen"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTextLenResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLenResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTopIndex,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTopIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTopIndexResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTopIndexResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetHorizontalExtent,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetHorizontalExtent"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetHorizontalExtentResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetHorizontalExtentResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindString,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindStringExact,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExact"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindStringExactResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringExactResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::FindStringResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "FindStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCaretIndex,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCaretIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCaretIndexResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCaretIndexResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCount,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCountResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCurSel,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetCurSelResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetHorizontalExtent,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetHorizontalExtent"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetHorizontalExtentResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetHorizontalExtentResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetItemHeight,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeight"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetItemHeightResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemHeightResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSel,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSelCount,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSelCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSelCountResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSelCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetSelResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetText,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTextLen,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLen"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTextLenResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextLenResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTextResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTopIndex,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTopIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::GetTopIndexResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetTopIndexResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelItemRange,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelItemRange"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelItemRangeResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelItemRangeResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelectString,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectString"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SelectStringResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SelectStringResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCaretIndex,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCaretIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCaretIndexResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCaretIndexResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCurSel,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetCurSelResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetSel,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Listbox::SetSelResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetSelResponse"),
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