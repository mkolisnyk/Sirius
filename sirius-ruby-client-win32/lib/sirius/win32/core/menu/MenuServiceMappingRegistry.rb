require 'MenuService.rb'
require 'soap/mapping'
module Sirius
module Win32
module Core
module Menu

module MenuServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
  LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
  NsClassesWin32ServerSiriusOrg = "http:classes.win32.server.sirius.org/"
  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemCount,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemCount"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemCountResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemCountResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::PickItem,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "pickItem"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::PickItemResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "pickItemResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemInfo,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemInfo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg2")]],
      ["arg3", ["Sirius::Win32::Core::Menu::Menuiteminfo", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::Menuiteminfo,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "menuiteminfo"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "structure"),
    :schema_element => [
      ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
      ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
      ["cbSize", ["SOAP::SOAPInt", XSD::QName.new(nil, "cbSize")]],
      ["fMask", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "fMask")], [0, 1]],
      ["fType", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "fType")], [0, 1]],
      ["fState", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "fState")], [0, 1]],
      ["wID", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "wID")], [0, 1]],
      ["hSubMenu", ["Sirius::Win32::Core::Menu::Hmenu", XSD::QName.new(nil, "hSubMenu")], [0, 1]],
      ["hbmpChecked", ["Sirius::Win32::Core::Menu::Hbitmap", XSD::QName.new(nil, "hbmpChecked")], [0, 1]],
      ["hbmpUnchecked", ["Sirius::Win32::Core::Menu::Hbitmap", XSD::QName.new(nil, "hbmpUnchecked")], [0, 1]],
      ["dwItemData", ["Sirius::Win32::Core::Menu::UlongPTR", XSD::QName.new(nil, "dwItemData")], [0, 1]],
      ["dwTypeData", ["SOAP::SOAPString", XSD::QName.new(nil, "dwTypeData")], [0, 1]],
      ["cch", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "cch")], [0, 1]],
      ["hbmpItem", ["Sirius::Win32::Core::Menu::Hbitmap", XSD::QName.new(nil, "hbmpItem")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::Uint,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "uint"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "dword"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::Dword,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "dword"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "integerType"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::Hmenu,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "hmenu"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "handle"),
    :schema_element => [
      ["pointer", ["Sirius::Win32::Core::Menu::Pointer", XSD::QName.new(nil, "pointer")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::Handle,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "handle"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "pointerType"),
    :schema_element => [
      ["pointer", ["Sirius::Win32::Core::Menu::Pointer", XSD::QName.new(nil, "pointer")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::Pointer,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "pointer"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::Hbitmap,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "hbitmap"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "handle"),
    :schema_element => [
      ["pointer", ["Sirius::Win32::Core::Menu::Pointer", XSD::QName.new(nil, "pointer")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::UlongPTR,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "ulongPTR"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "integerType"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemInfoResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemInfoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuState,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuState"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuStateResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuStateResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuString,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuString"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPUnsignedShort[]", XSD::QName.new(nil, "arg2")], [0, nil]],
      ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
      ["arg4", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg4")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuStringResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuStringResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemRect,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemRect"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
      ["arg3", ["Sirius::Win32::Core::Menu::Rect", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::Rect,
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
    :class => Sirius::Win32::Core::Menu::GetMenuItemRectResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemRectResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemID,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemID"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemIDResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemIDResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuDefaultItem,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuDefaultItem"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuDefaultItemResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuDefaultItemResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuInfo,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuInfo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["Sirius::Win32::Core::Menu::Menuinfo", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::Menuinfo,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "menuinfo"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "structure"),
    :schema_element => [
      ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
      ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
      ["cbSize", ["SOAP::SOAPInt", XSD::QName.new(nil, "cbSize")]],
      ["fMask", ["Sirius::Win32::Core::Menu::Dword", XSD::QName.new(nil, "fMask")], [0, 1]],
      ["dwStyle", ["Sirius::Win32::Core::Menu::Dword", XSD::QName.new(nil, "dwStyle")], [0, 1]],
      ["cyMax", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "cyMax")], [0, 1]],
      ["hbrBack", ["Sirius::Win32::Core::Menu::Hbrush", XSD::QName.new(nil, "hbrBack")], [0, 1]],
      ["dwContextHelpID", ["Sirius::Win32::Core::Menu::Dword", XSD::QName.new(nil, "dwContextHelpID")], [0, 1]],
      ["dwMenuData", ["Sirius::Win32::Core::Menu::UlongPTR", XSD::QName.new(nil, "dwMenuData")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::Hbrush,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "hbrush"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "handle"),
    :schema_element => [
      ["pointer", ["Sirius::Win32::Core::Menu::Pointer", XSD::QName.new(nil, "pointer")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuInfoResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuInfoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::IsMenu,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "IsMenu"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::IsMenuResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "IsMenuResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetSubMenu,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetSubMenu"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetSubMenuResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetSubMenuResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemCount,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemCount"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemCountResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemCountResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::PickItem,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "pickItem"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::PickItemResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "pickItemResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemInfo,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemInfo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg2")]],
      ["arg3", ["Sirius::Win32::Core::Menu::Menuiteminfo", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::Menuiteminfo,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "menuiteminfo"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "structure"),
    :schema_element => [
      ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
      ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
      ["cbSize", ["SOAP::SOAPInt", XSD::QName.new(nil, "cbSize")]],
      ["fMask", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "fMask")], [0, 1]],
      ["fType", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "fType")], [0, 1]],
      ["fState", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "fState")], [0, 1]],
      ["wID", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "wID")], [0, 1]],
      ["hSubMenu", ["Sirius::Win32::Core::Menu::Hmenu", XSD::QName.new(nil, "hSubMenu")], [0, 1]],
      ["hbmpChecked", ["Sirius::Win32::Core::Menu::Hbitmap", XSD::QName.new(nil, "hbmpChecked")], [0, 1]],
      ["hbmpUnchecked", ["Sirius::Win32::Core::Menu::Hbitmap", XSD::QName.new(nil, "hbmpUnchecked")], [0, 1]],
      ["dwItemData", ["Sirius::Win32::Core::Menu::UlongPTR", XSD::QName.new(nil, "dwItemData")], [0, 1]],
      ["dwTypeData", ["SOAP::SOAPString", XSD::QName.new(nil, "dwTypeData")], [0, 1]],
      ["cch", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "cch")], [0, 1]],
      ["hbmpItem", ["Sirius::Win32::Core::Menu::Hbitmap", XSD::QName.new(nil, "hbmpItem")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::Uint,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "uint"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "dword"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::Dword,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "dword"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "integerType"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::Hmenu,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "hmenu"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "handle"),
    :schema_element => [
      ["pointer", ["Sirius::Win32::Core::Menu::Pointer", XSD::QName.new(nil, "pointer")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::Handle,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "handle"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "pointerType"),
    :schema_element => [
      ["pointer", ["Sirius::Win32::Core::Menu::Pointer", XSD::QName.new(nil, "pointer")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::Pointer,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "pointer"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::Hbitmap,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "hbitmap"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "handle"),
    :schema_element => [
      ["pointer", ["Sirius::Win32::Core::Menu::Pointer", XSD::QName.new(nil, "pointer")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::UlongPTR,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "ulongPTR"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "integerType"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemInfoResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemInfoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuState,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuState"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuStateResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuStateResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuString,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuString"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPUnsignedShort[]", XSD::QName.new(nil, "arg2")], [0, nil]],
      ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
      ["arg4", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg4")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuStringResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuStringResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemRect,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemRect"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
      ["arg3", ["Sirius::Win32::Core::Menu::Rect", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::Rect,
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
    :class => Sirius::Win32::Core::Menu::GetMenuItemRectResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemRectResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemID,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemID"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemIDResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemIDResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuDefaultItem,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuDefaultItem"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuDefaultItemResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuDefaultItemResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuInfo,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuInfo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["Sirius::Win32::Core::Menu::Menuinfo", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::Menuinfo,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "menuinfo"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "structure"),
    :schema_element => [
      ["autoRead", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoRead")]],
      ["autoWrite", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "autoWrite")]],
      ["cbSize", ["SOAP::SOAPInt", XSD::QName.new(nil, "cbSize")]],
      ["fMask", ["Sirius::Win32::Core::Menu::Dword", XSD::QName.new(nil, "fMask")], [0, 1]],
      ["dwStyle", ["Sirius::Win32::Core::Menu::Dword", XSD::QName.new(nil, "dwStyle")], [0, 1]],
      ["cyMax", ["Sirius::Win32::Core::Menu::Uint", XSD::QName.new(nil, "cyMax")], [0, 1]],
      ["hbrBack", ["Sirius::Win32::Core::Menu::Hbrush", XSD::QName.new(nil, "hbrBack")], [0, 1]],
      ["dwContextHelpID", ["Sirius::Win32::Core::Menu::Dword", XSD::QName.new(nil, "dwContextHelpID")], [0, 1]],
      ["dwMenuData", ["Sirius::Win32::Core::Menu::UlongPTR", XSD::QName.new(nil, "dwMenuData")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::Hbrush,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "hbrush"),
    :schema_basetype => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "handle"),
    :schema_element => [
      ["pointer", ["Sirius::Win32::Core::Menu::Pointer", XSD::QName.new(nil, "pointer")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuInfoResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuInfoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::IsMenu,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "IsMenu"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::IsMenuResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "IsMenuResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetSubMenu,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetSubMenu"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetSubMenuResponse,
    :schema_type => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetSubMenuResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuDefaultItem,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuDefaultItem"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuDefaultItemResponse,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuDefaultItemResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuInfo,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuInfo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["Sirius::Win32::Core::Menu::Menuinfo", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuInfoResponse,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuInfoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemCount,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemCount"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemCountResponse,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemCountResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemID,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemID"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemIDResponse,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemIDResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemInfo,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemInfo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "arg2")]],
      ["arg3", ["Sirius::Win32::Core::Menu::Menuiteminfo", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemInfoResponse,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemInfoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemRect,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemRect"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]],
      ["arg3", ["Sirius::Win32::Core::Menu::Rect", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuItemRectResponse,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuItemRectResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuState,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuState"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuStateResponse,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuStateResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuString,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuString"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPUnsignedShort[]", XSD::QName.new(nil, "arg2")], [0, nil]],
      ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]],
      ["arg4", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg4")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetMenuStringResponse,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetMenuStringResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetSubMenu,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetSubMenu"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::GetSubMenuResponse,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "GetSubMenuResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::IsMenu,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "IsMenu"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::IsMenuResponse,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "IsMenuResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::PickItem,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "pickItem"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Win32::Core::Menu::PickItemResponse,
    :schema_name => XSD::QName.new(NsClassesWin32ServerSiriusOrg, "pickItemResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )
end

end
end
end
end