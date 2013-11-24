require 'ListBoxService.rb'
require 'soap/mapping'
module Sirius
module Client
module Win32
module Core
module Listbox

module ListBoxServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
  LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
  NsControlsClassesWin32ServerSiriusOrg = "http:controls.classes.win32.server.sirius.org/"
  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::Equals,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "equals"),
    :schema_element => [
      ["arg0", [nil, XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::EqualsResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "equalsResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByIndex,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByIndexResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByIndexResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemNames,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemNames"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemNamesResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemNamesResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectAll,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectAll"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectAllResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectAllResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByName,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByNameResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByNameResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByName,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByNameResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByNameResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItem,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItem"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItemResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItemResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetEndpoint,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getEndpoint"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetEndpointResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getEndpointResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByIndex,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByIndexResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByIndexResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemsCount,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemsCount"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemsCountResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemsCountResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByName,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByNameResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByNameResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::DeselectAll,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "deselectAll"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::DeselectAllResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "deselectAllResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItems,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItems"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItemsResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItemsResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedIndex,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedIndexResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedIndexResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByIndex,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByIndexResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByIndexResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::Equals,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "equals"),
    :schema_element => [
      ["arg0", [nil, XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::EqualsResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "equalsResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByIndex,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByIndexResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByIndexResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemNames,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemNames"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemNamesResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemNamesResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectAll,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectAll"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectAllResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectAllResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByName,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByNameResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByNameResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByName,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByNameResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByNameResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItem,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItem"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItemResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItemResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetEndpoint,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getEndpoint"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetEndpointResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getEndpointResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByIndex,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByIndexResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByIndexResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemsCount,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemsCount"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemsCountResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemsCountResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByName,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByNameResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByNameResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::DeselectAll,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "deselectAll"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::DeselectAllResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "deselectAllResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItems,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItems"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItemsResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItemsResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedIndex,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedIndexResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedIndexResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByIndex,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByIndexResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByIndexResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByIndex,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByIndexResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByIndexResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByName,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::AddSelectionByNameResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "addSelectionByNameResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::DeselectAll,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "deselectAll"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::DeselectAllResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "deselectAllResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::Equals,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "equals"),
    :schema_element => [
      ["arg0", [nil, XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::EqualsResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "equalsResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetEndpoint,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getEndpoint"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetEndpointResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getEndpointResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemNames,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemNames"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemNamesResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemNamesResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemsCount,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemsCount"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetItemsCountResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getItemsCountResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedIndex,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedIndexResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedIndexResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItem,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItem"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItemResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItemResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItems,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItems"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::GetSelectedItemsResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelectedItemsResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByIndex,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByIndexResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByIndexResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByName,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::RemoveSelectionByNameResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "removeSelectionByNameResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectAll,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectAll"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectAllResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectAllResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByIndex,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByIndexResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByIndexResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByName,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Listbox::SelectByNameResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "selectByNameResponse"),
    :schema_element => []
  )
end

end
end
end
end
end