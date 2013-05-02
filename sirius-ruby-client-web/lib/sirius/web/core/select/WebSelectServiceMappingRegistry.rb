# encoding: UTF-8
require 'sirius/web/core/select/WebSelectService.rb'
require 'soap/mapping'

module Sirius  module Client    module Web      module Core        module Select
          module WebSelectServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
            LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
            NsWebServerSiriusOrg = "http:web.server.sirius.org/"
            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByVisibleText,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByVisibleText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByVisibleTextResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByVisibleTextResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByValue,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByValue"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByValueResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByValueResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByVisibleText,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByVisibleText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByVisibleTextResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByVisibleTextResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllSelectedOptions,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAllSelectedOptions"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllSelectedOptionsResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAllSelectedOptionsResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByIndex,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByIndexResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByIndexResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectAll,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectAll"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectAllResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectAllResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByIndex,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByIndexResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByIndexResponse"),
            :schema_element => []
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllOptions,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAllOptions"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllOptionsResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAllOptionsResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetFirstSelectedOption,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getFirstSelectedOption"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetFirstSelectedOptionResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getFirstSelectedOptionResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::IsMultiple,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isMultiple"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::IsMultipleResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isMultipleResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByValue,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByValue"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByValueResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByValueResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByVisibleText,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByVisibleText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByVisibleTextResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByVisibleTextResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByValue,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByValue"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByValueResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByValueResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByVisibleText,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByVisibleText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByVisibleTextResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByVisibleTextResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllSelectedOptions,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAllSelectedOptions"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllSelectedOptionsResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAllSelectedOptionsResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByIndex,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByIndexResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByIndexResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectAll,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectAll"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectAllResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectAllResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByIndex,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByIndexResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "selectByIndexResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllOptions,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAllOptions"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllOptionsResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getAllOptionsResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetFirstSelectedOption,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getFirstSelectedOption"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetFirstSelectedOptionResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "getFirstSelectedOptionResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::IsMultiple,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isMultiple"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::IsMultipleResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "isMultipleResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByValue,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByValue"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByValueResponse,
            :schema_type => XSD::QName.new(NsWebServerSiriusOrg, "deselectByValueResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectAll,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "deselectAll"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectAllResponse,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "deselectAllResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByIndex,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "deselectByIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByIndexResponse,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "deselectByIndexResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByValue,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "deselectByValue"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByValueResponse,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "deselectByValueResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByVisibleText,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "deselectByVisibleText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::DeselectByVisibleTextResponse,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "deselectByVisibleTextResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllOptions,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getAllOptions"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllOptionsResponse,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getAllOptionsResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllSelectedOptions,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getAllSelectedOptions"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetAllSelectedOptionsResponse,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getAllSelectedOptionsResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString[]", XSD::QName.new(nil, "return")], [0, nil]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetFirstSelectedOption,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getFirstSelectedOption"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::GetFirstSelectedOptionResponse,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "getFirstSelectedOptionResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::IsMultiple,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "isMultiple"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::IsMultipleResponse,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "isMultipleResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByIndex,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectByIndex"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg3")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByIndexResponse,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectByIndexResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByValue,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectByValue"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByValueResponse,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectByValueResponse"),
            :schema_element => []
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByVisibleText,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectByVisibleText"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPString", XSD::QName.new(nil, "arg0")], [0, 1]],
              ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]],
              ["arg2", ["SOAP::SOAPString", XSD::QName.new(nil, "arg2")], [0, 1]],
              ["arg3", ["SOAP::SOAPString", XSD::QName.new(nil, "arg3")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Web::Core::Select::SelectByVisibleTextResponse,
            :schema_name => XSD::QName.new(NsWebServerSiriusOrg, "selectByVisibleTextResponse"),
            :schema_element => []
            )
          end

        end
      end
    end
  end
end