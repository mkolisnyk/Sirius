# encoding: UTF-8
require 'sirius/web/core/WebCoreService.rb'
require 'soap/mapping'
module Sirius
module Client
module Web
module Core

module WebCoreServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
  LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
  NsWebServerSiriusOrg = "http:web.server.sirius.org/"
  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SelectWindow,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectWindow"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SelectWindowResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectWindowResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::IsSelected,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isSelected"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::IsSelectedResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isSelectedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::Start,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "start"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::StartResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "startResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByIndex,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByIndexResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByIndexResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetLocation,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getLocation"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetLocationResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getLocationResponse"),
    :schema_element => [
      ["v_return", ["Sirius::Client::Web::Core::Point", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::Point,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "point"),
    :schema_element => [
      ["x", ["SOAP::SOAPInt", XSD::QName.new(nil, "x")]],
      ["y", ["SOAP::SOAPInt", XSD::QName.new(nil, "y")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SelectAlert,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectAlert"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SelectAlertResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectAlertResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetURL,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getURL"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetURLResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getURLResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::Submit,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "submit"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SubmitResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "submitResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByName,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByNameResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByNameResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::IsEnabled,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isEnabled"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::IsEnabledResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isEnabledResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::Back,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "back"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::BackResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "backResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::Forward,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "forward"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::ForwardResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "forwardResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::Clear,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "clear"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::ClearResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "clearResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::Open,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "open"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::OpenResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "openResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetText,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetTextResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetSize,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getSize"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetSizeResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getSizeResponse"),
    :schema_element => [
      ["v_return", ["Sirius::Client::Web::Core::Dimension", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::Dimension,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "dimension"),
    :schema_element => [
      ["width", ["SOAP::SOAPInt", XSD::QName.new(nil, "width")]],
      ["height", ["SOAP::SOAPInt", XSD::QName.new(nil, "height")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::Refresh,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "refresh"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::RefreshResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "refreshResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetTagName,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getTagName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetTagNameResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getTagNameResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetTitle,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getTitle"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetTitleResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getTitleResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::IsDisplayed,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isDisplayed"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::IsDisplayedResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isDisplayedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SelectDefaultContent,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectDefaultContent"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SelectDefaultContentResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectDefaultContentResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetWindowHandle,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getWindowHandle"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetWindowHandleResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getWindowHandleResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::Stop,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "stop"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::StopResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "stopResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SendKeys,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "sendKeys"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
      ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::SendKeysResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "sendKeysResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetPageSource,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getPageSource"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetPageSourceResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getPageSourceResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetAttribute,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAttribute"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
      ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetAttributeResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAttributeResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::Click,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "click"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::ClickResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "clickResponse"),
    :schema_element => []
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetCssValue,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getCssValue"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
      ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Web::Core::GetCssValueResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getCssValueResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectWindow,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectWindow"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectWindowResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectWindowResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsSelected,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isSelected"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsSelectedResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isSelectedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Start,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "start"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::StartResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "startResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByIndex,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByIndexResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByIndexResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetLocation,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getLocation"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetLocationResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getLocationResponse"),
    :schema_element => [
      ["v_return", ["Sirius::Client::Web::Core::Point", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Point,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "point"),
    :schema_element => [
      ["x", ["SOAP::SOAPInt", XSD::QName.new(nil, "x")]],
      ["y", ["SOAP::SOAPInt", XSD::QName.new(nil, "y")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectAlert,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectAlert"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectAlertResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectAlertResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetURL,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getURL"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetURLResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getURLResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Submit,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "submit"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SubmitResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "submitResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByName,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByNameResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByNameResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsEnabled,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isEnabled"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsEnabledResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isEnabledResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Back,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "back"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::BackResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "backResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Forward,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "forward"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::ForwardResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "forwardResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Clear,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "clear"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::ClearResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "clearResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Open,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "open"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::OpenResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "openResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetText,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetTextResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetSize,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getSize"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetSizeResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getSizeResponse"),
    :schema_element => [
      ["v_return", ["Sirius::Client::Web::Core::Dimension", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Dimension,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "dimension"),
    :schema_element => [
      ["width", ["SOAP::SOAPInt", XSD::QName.new(nil, "width")]],
      ["height", ["SOAP::SOAPInt", XSD::QName.new(nil, "height")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Refresh,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "refresh"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::RefreshResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "refreshResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetTagName,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getTagName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetTagNameResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getTagNameResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetTitle,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getTitle"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetTitleResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getTitleResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsDisplayed,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isDisplayed"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsDisplayedResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isDisplayedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectDefaultContent,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectDefaultContent"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectDefaultContentResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectDefaultContentResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetWindowHandle,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getWindowHandle"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetWindowHandleResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getWindowHandleResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Stop,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "stop"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::StopResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "stopResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SendKeys,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "sendKeys"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
      ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SendKeysResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "sendKeysResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetPageSource,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getPageSource"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetPageSourceResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getPageSourceResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetAttribute,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAttribute"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
      ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetAttributeResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAttributeResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Click,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "click"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::ClickResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "clickResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetCssValue,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getCssValue"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
      ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetCssValueResponse,
    :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getCssValueResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Back,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "back"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::BackResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "backResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Clear,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "clear"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::ClearResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "clearResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Click,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "click"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::ClickResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "clickResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Forward,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "forward"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::ForwardResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "forwardResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetAttribute,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getAttribute"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
      ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetAttributeResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getAttributeResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetCssValue,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getCssValue"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
      ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetCssValueResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getCssValueResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetLocation,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getLocation"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetLocationResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getLocationResponse"),
    :schema_element => [
      ["v_return", ["Sirius::Client::Web::Core::Point", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetPageSource,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getPageSource"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetPageSourceResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getPageSourceResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetSize,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getSize"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetSizeResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getSizeResponse"),
    :schema_element => [
      ["v_return", ["Sirius::Client::Web::Core::Dimension", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetTagName,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getTagName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetTagNameResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getTagNameResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetText,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetTextResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetTitle,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getTitle"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetTitleResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getTitleResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetURL,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getURL"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetURLResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getURLResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetWindowHandle,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getWindowHandle"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::GetWindowHandleResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getWindowHandleResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsDisplayed,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "isDisplayed"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsDisplayedResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "isDisplayedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsEnabled,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "isEnabled"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsEnabledResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "isEnabledResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsSelected,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "isSelected"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::IsSelectedResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "isSelectedResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Open,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "open"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::OpenResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "openResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Refresh,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "refresh"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::RefreshResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "refreshResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectAlert,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectAlert"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectAlertResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectAlertResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectDefaultContent,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectDefaultContent"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectDefaultContentResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectDefaultContentResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByIndex,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByIndexResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByIndexResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByName,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByName"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectFrameByNameResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectFrameByNameResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectWindow,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectWindow"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SelectWindowResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectWindowResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SendKeys,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "sendKeys"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
      ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SendKeysResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "sendKeysResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Start,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "start"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::StartResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "startResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Stop,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "stop"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::StopResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "stopResponse"),
    :schema_element => []
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::Submit,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "submit"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
      ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Web::Core::SubmitResponse,
    :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "submitResponse"),
    :schema_element => []
  )
end

end
end
end
end