require 'WindowService.rb'
require 'soap/mapping'

module Sirius  module Client    module Win32      module Core        module Window
          module WindowServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
            LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
            NsClassesWin32ServerSiriusOrg = "http://classes.win32.server.sirius.org/"
            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyUp,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyUp"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyUpResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyUpResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetSystemMenu,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getSystemMenu"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetSystemMenuResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getSystemMenuResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Move,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "move"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg4")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MoveResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "moveResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetRect,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getRect"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetRectResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getRectResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Window::Rect", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Rect,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "rect"),
            :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "structure"),
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
            :class => Sirius::Client::Win32::Core::Window::MoveTo,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "moveTo"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MoveToResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "moveToResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsNormal,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isNormal"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsNormalResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isNormalResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsWindow,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isWindow"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsWindowResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isWindowResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsVisible,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isVisible"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsVisibleResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isVisibleResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Activate,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "activate"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::ActivateResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "activateResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetText,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetTextResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMaximized,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMaximized"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMaximizedResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMaximizedResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Click,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "click"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::ClickResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "clickResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Close,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "close"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::CloseResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "closeResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyDown,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyDown"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyDownResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyDownResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyPress,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyPress"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyPressResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyPressResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMinimized,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMinimized"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMinimizedResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMinimizedResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetMenu,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getMenu"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetMenuResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getMenuResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Maximize,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "maximize"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MaximizeResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "maximizeResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetWindowPlacement,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getWindowPlacement"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["Sirius::Client::Win32::Core::Window::Windowplacement", XSD::QName.new(nil, "arg1")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Windowplacement,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "windowplacement"),
            :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["length", ["SOAP::SOAPInt", XSD::QName.new(nil, "length")]],
              ["flags", ["SOAP::SOAPInt", XSD::QName.new(nil, "flags")]],
              ["showCmd", ["SOAP::SOAPInt", XSD::QName.new(nil, "showCmd")]],
              ["ptMinPosition", ["Sirius::Client::Win32::Core::Window::Point", XSD::QName.new(nil, "ptMinPosition")], [0, 1]],
              ["ptMaxPosition", ["Sirius::Client::Win32::Core::Window::Point", XSD::QName.new(nil, "ptMaxPosition")], [0, 1]],
              ["rcNormalPosition", ["Sirius::Client::Win32::Core::Window::Rect", XSD::QName.new(nil, "rcNormalPosition")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Point,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "point"),
            :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["x", ["SOAP::SOAPInt", XSD::QName.new(nil, "x")]],
              ["y", ["SOAP::SOAPInt", XSD::QName.new(nil, "y")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetWindowPlacementResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getWindowPlacementResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetClientRect,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getClientRect"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetClientRectResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getClientRectResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Window::Rect", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseDown,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseDown"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseDownResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseDownResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::SizeTo,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "sizeTo"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::SizeToResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "sizeToResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Restore,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "restore"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::RestoreResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "restoreResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Start,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "start"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::StartResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "startResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseUp,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseUp"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseUpResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseUpResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Minimize,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "minimize"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MinimizeResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "minimizeResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsEnabled,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isEnabled"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsEnabledResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isEnabledResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsUnicode,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isUnicode"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsUnicodeResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isUnicodeResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::DoubleClick,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "doubleClick"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::DoubleClickResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "doubleClickResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyUp,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyUp"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyUpResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyUpResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetSystemMenu,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getSystemMenu"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetSystemMenuResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getSystemMenuResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Move,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "move"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg4")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MoveResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "moveResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetRect,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getRect"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetRectResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getRectResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Window::Rect", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Rect,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "rect"),
            :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "structure"),
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
            :class => Sirius::Client::Win32::Core::Window::MoveTo,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "moveTo"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MoveToResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "moveToResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsNormal,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isNormal"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsNormalResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isNormalResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsWindow,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isWindow"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsWindowResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isWindowResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsVisible,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isVisible"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsVisibleResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isVisibleResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Activate,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "activate"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::ActivateResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "activateResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetText,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetTextResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMaximized,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMaximized"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMaximizedResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMaximizedResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Click,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "click"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::ClickResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "clickResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Close,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "close"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::CloseResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "closeResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyDown,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyDown"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyDownResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyDownResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyPress,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyPress"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyPressResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyPressResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMinimized,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMinimized"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMinimizedResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMinimizedResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetMenu,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getMenu"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetMenuResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getMenuResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Maximize,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "maximize"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MaximizeResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "maximizeResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetWindowPlacement,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getWindowPlacement"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["Sirius::Client::Win32::Core::Window::Windowplacement", XSD::QName.new(nil, "arg1")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Windowplacement,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "windowplacement"),
            :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["length", ["SOAP::SOAPInt", XSD::QName.new(nil, "length")]],
              ["flags", ["SOAP::SOAPInt", XSD::QName.new(nil, "flags")]],
              ["showCmd", ["SOAP::SOAPInt", XSD::QName.new(nil, "showCmd")]],
              ["ptMinPosition", ["Sirius::Client::Win32::Core::Window::Point", XSD::QName.new(nil, "ptMinPosition")], [0, 1]],
              ["ptMaxPosition", ["Sirius::Client::Win32::Core::Window::Point", XSD::QName.new(nil, "ptMaxPosition")], [0, 1]],
              ["rcNormalPosition", ["Sirius::Client::Win32::Core::Window::Rect", XSD::QName.new(nil, "rcNormalPosition")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Point,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "point"),
            :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "structure"),
            :schema_element => [
              ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
              ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
              ["x", ["SOAP::SOAPInt", XSD::QName.new(nil, "x")]],
              ["y", ["SOAP::SOAPInt", XSD::QName.new(nil, "y")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetWindowPlacementResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getWindowPlacementResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetClientRect,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getClientRect"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetClientRectResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getClientRectResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Window::Rect", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseDown,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseDown"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseDownResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseDownResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::SizeTo,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "sizeTo"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::SizeToResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "sizeToResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Restore,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "restore"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::RestoreResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "restoreResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Start,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "start"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::StartResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "startResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseUp,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseUp"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseUpResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseUpResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Minimize,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "minimize"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MinimizeResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "minimizeResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsEnabled,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isEnabled"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsEnabledResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isEnabledResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsUnicode,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isUnicode"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsUnicodeResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isUnicodeResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::DoubleClick,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "doubleClick"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::DoubleClickResponse,
            :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "doubleClickResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Activate,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "activate"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::ActivateResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "activateResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Click,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "click"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::ClickResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "clickResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Close,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "close"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::CloseResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "closeResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::DoubleClick,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "doubleClick"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::DoubleClickResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "doubleClickResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetClientRect,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getClientRect"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetClientRectResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getClientRectResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Window::Rect", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetMenu,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getMenu"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetMenuResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getMenuResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetRect,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getRect"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetRectResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getRectResponse"),
            :schema_element => [
              ["v_return", ["Sirius::Client::Win32::Core::Window::Rect", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetSystemMenu,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getSystemMenu"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetSystemMenuResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getSystemMenuResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetText,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetTextResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getTextResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetWindowPlacement,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getWindowPlacement"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["Sirius::Client::Win32::Core::Window::Windowplacement", XSD::QName.new(nil, "arg1")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::GetWindowPlacementResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "getWindowPlacementResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsEnabled,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isEnabled"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsEnabledResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isEnabledResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMaximized,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMaximized"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMaximizedResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMaximizedResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMinimized,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMinimized"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsMinimizedResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isMinimizedResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsNormal,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isNormal"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsNormalResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isNormalResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsUnicode,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isUnicode"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsUnicodeResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isUnicodeResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsVisible,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isVisible"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsVisibleResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isVisibleResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsWindow,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isWindow"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::IsWindowResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "isWindowResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyDown,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyDown"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyDownResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyDownResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyPress,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyPress"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyPressResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyPressResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyUp,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyUp"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::KeyUpResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "keyUpResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Maximize,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "maximize"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MaximizeResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "maximizeResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Minimize,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "minimize"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MinimizeResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "minimizeResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseDown,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseDown"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseDownResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseDownResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseUp,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseUp"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg4")]],
              ["arg5", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg5")]],
              ["arg6", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg6")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MouseUpResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "mouseUpResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Move,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "move"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
              ["arg4", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg4")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MoveResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "moveResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MoveTo,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "moveTo"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::MoveToResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "moveToResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Restore,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "restore"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::RestoreResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "restoreResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::SizeTo,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "sizeTo"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
              ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::SizeToResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "sizeToResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::Start,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "start"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Window::StartResponse,
            :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "startResponse"),
            :schema_element => []
            )
          end

        end
      end
    end
  end
end