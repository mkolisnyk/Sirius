require 'TabControlService.rb'
require 'soap/mapping'

module Sirius  module Client    module Win32      module Core        module Tabcontrol
          module TabControlServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
            LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
            NsControlsClassesWin32ServerSiriusOrg = "http:controls.classes.win32.server.sirius.org/"
            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurFocus,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurFocus"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurFocusResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurFocusResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetRowCount,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetRowCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetRowCountResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetRowCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::HitTest,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "HitTest"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::HitTestResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "HitTestResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Tabcontrol::TcHITTESTINFO", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::TcHITTESTINFO,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "tcHITTESTINFO"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["pt", ["Sirius::Client::Win32::Core::Tabcontrol::Point", XSD::QName.new(nil, "pt")], [0, 1]],
              ["flags", ["SOAP::SOAPInt", XSD::QName.new(nil, "flags")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::Point,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "point"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["x", ["SOAP::SOAPInt", XSD::QName.new(nil, "x")]],
              ["y", ["SOAP::SOAPInt", XSD::QName.new(nil, "y")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemCount,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemCountResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemRect,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemRect"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemRectResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemRectResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Tabcontrol::Rect", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::Rect,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "rect"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["left", ["SOAP::SOAPInt", XSD::QName.new(nil, "left")]],
              ["top", ["SOAP::SOAPInt", XSD::QName.new(nil, "top")]],
              ["right", ["SOAP::SOAPInt", XSD::QName.new(nil, "right")]],
              ["bottom", ["SOAP::SOAPInt", XSD::QName.new(nil, "bottom")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurFocus,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurFocus"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurFocusResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurFocusResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSelResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItem,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItem"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Tabcontrol::TcITEM", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::TcITEM,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "tcITEM"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["mask", ["SOAP::SOAPInt", XSD::QName.new(nil, "mask")]],
              ["dwState", ["SOAP::SOAPInt", XSD::QName.new(nil, "dwState")]],
              ["dwStateMask", ["SOAP::SOAPInt", XSD::QName.new(nil, "dwStateMask")]],
              ["pszText", ["SOAP::SOAPString", XSD::QName.new(nil, "pszText")], [0, 1]],
              ["cchTextMax", ["SOAP::SOAPInt", XSD::QName.new(nil, "cchTextMax")]],
              ["iImage", ["SOAP::SOAPInt", XSD::QName.new(nil, "iImage")]],
              ["lParam", ["Sirius::Client::Win32::Core::Tabcontrol::Lparam", XSD::QName.new(nil, "lParam")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::Lparam,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lparam"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "longPTR"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::LongPTR,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "longPTR"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "integerType"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurFocus,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurFocus"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurFocusResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurFocusResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetRowCount,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetRowCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetRowCountResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetRowCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::HitTest,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "HitTest"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::HitTestResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "HitTestResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Tabcontrol::TcHITTESTINFO", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::TcHITTESTINFO,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "tcHITTESTINFO"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["pt", ["Sirius::Client::Win32::Core::Tabcontrol::Point", XSD::QName.new(nil, "pt")], [0, 1]],
              ["flags", ["SOAP::SOAPInt", XSD::QName.new(nil, "flags")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::Point,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "point"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["x", ["SOAP::SOAPInt", XSD::QName.new(nil, "x")]],
              ["y", ["SOAP::SOAPInt", XSD::QName.new(nil, "y")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemCount,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemCountResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemRect,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemRect"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemRectResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemRectResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Tabcontrol::Rect", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::Rect,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "rect"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["left", ["SOAP::SOAPInt", XSD::QName.new(nil, "left")]],
              ["top", ["SOAP::SOAPInt", XSD::QName.new(nil, "top")]],
              ["right", ["SOAP::SOAPInt", XSD::QName.new(nil, "right")]],
              ["bottom", ["SOAP::SOAPInt", XSD::QName.new(nil, "bottom")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurFocus,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurFocus"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurFocusResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurFocusResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurSel,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurSelResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSelResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItem,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItem"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemResponse,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Tabcontrol::TcITEM", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::TcITEM,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "tcITEM"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["mask", ["SOAP::SOAPInt", XSD::QName.new(nil, "mask")]],
              ["dwState", ["SOAP::SOAPInt", XSD::QName.new(nil, "dwState")]],
              ["dwStateMask", ["SOAP::SOAPInt", XSD::QName.new(nil, "dwStateMask")]],
              ["pszText", ["SOAP::SOAPString", XSD::QName.new(nil, "pszText")], [0, 1]],
              ["cchTextMax", ["SOAP::SOAPInt", XSD::QName.new(nil, "cchTextMax")]],
              ["iImage", ["SOAP::SOAPInt", XSD::QName.new(nil, "iImage")]],
              ["lParam", ["Sirius::Client::Win32::Core::Tabcontrol::Lparam", XSD::QName.new(nil, "lParam")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::Lparam,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lparam"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "longPTR"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::LongPTR,
            :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "longPTR"),
            :schema_basetype => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "integerType"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurFocus,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurFocus"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurFocusResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurFocusResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurSel,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetCurSelResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetCurSelResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItem,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItem"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemCount,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemCountResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemRect,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemRect"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemRectResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemRectResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Tabcontrol::Rect", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetItemResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetItemResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Tabcontrol::TcITEM", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetRowCount,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetRowCount"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::GetRowCountResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "GetRowCountResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::HitTest,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "HitTest"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::HitTestResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "HitTestResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Tabcontrol::TcHITTESTINFO", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurFocus,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurFocus"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurFocusResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurFocusResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurSel,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSel"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Tabcontrol::SetCurSelResponse,
            :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "SetCurSelResponse"),
            :schema_element => []
            )
          end

        end
      end
    end
  end
end