require 'Win32UtilsService.rb'
require 'soap/mapping'

module Sirius  module Client    module Win32      module Core        module Utils
          module Win32UtilsServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
            LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
            NsWin32ServerSiriusOrg = "http:win32.server.sirius.org/"
            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchSameThreadWindow,
            :schema_type => XSD::QName.new(NsWin32ServerSiriusOrg, "searchSameThreadWindow"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["Sirius::Client::Win32::Core::Utils::Win32Locator", XSD::QName.new(nil, "arg1")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::Win32Locator,
            :schema_type => XSD::QName.new(NsWin32ServerSiriusOrg, "win32Locator"),
            :schema_element => [
              ["caption", ["SOAP::SOAPString", XSD::QName.new(nil, "caption")], [0, 1]],
              ["hwnd", ["SOAP::SOAPLong", XSD::QName.new(nil, "hwnd")]],
              ["index", ["SOAP::SOAPInt", XSD::QName.new(nil, "index")]],
              ["parent", ["SOAP::SOAPLong", XSD::QName.new(nil, "parent")]],
              ["winClass", ["SOAP::SOAPString", XSD::QName.new(nil, "winClass")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchSameThreadWindowResponse,
            :schema_type => XSD::QName.new(NsWin32ServerSiriusOrg, "searchSameThreadWindowResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchWindow,
            :schema_type => XSD::QName.new(NsWin32ServerSiriusOrg, "searchWindow"),
            :schema_element => [
              ["arg0", ["Sirius::Client::Win32::Core::Utils::Win32Locator", XSD::QName.new(nil, "arg0")], [0, 1]]
            ]
            )

            EncodedRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchWindowResponse,
            :schema_type => XSD::QName.new(NsWin32ServerSiriusOrg, "searchWindowResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchSameThreadWindow,
            :schema_type => XSD::QName.new(NsWin32ServerSiriusOrg, "searchSameThreadWindow"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["Sirius::Client::Win32::Core::Utils::Win32Locator", XSD::QName.new(nil, "arg1")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::Win32Locator,
            :schema_type => XSD::QName.new(NsWin32ServerSiriusOrg, "win32Locator"),
            :schema_element => [
              ["caption", ["SOAP::SOAPString", XSD::QName.new(nil, "caption")], [0, 1]],
              ["hwnd", ["SOAP::SOAPLong", XSD::QName.new(nil, "hwnd")]],
              ["index", ["SOAP::SOAPInt", XSD::QName.new(nil, "index")]],
              ["parent", ["SOAP::SOAPLong", XSD::QName.new(nil, "parent")]],
              ["winClass", ["SOAP::SOAPString", XSD::QName.new(nil, "winClass")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchSameThreadWindowResponse,
            :schema_type => XSD::QName.new(NsWin32ServerSiriusOrg, "searchSameThreadWindowResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchWindow,
            :schema_type => XSD::QName.new(NsWin32ServerSiriusOrg, "searchWindow"),
            :schema_element => [
              ["arg0", ["Sirius::Client::Win32::Core::Utils::Win32Locator", XSD::QName.new(nil, "arg0")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchWindowResponse,
            :schema_type => XSD::QName.new(NsWin32ServerSiriusOrg, "searchWindowResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchSameThreadWindow,
            :schema_name => XSD::QName.new(NsWin32ServerSiriusOrg, "searchSameThreadWindow"),
            :schema_element => [
              ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
              ["arg1", ["Sirius::Client::Win32::Core::Utils::Win32Locator", XSD::QName.new(nil, "arg1")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchSameThreadWindowResponse,
            :schema_name => XSD::QName.new(NsWin32ServerSiriusOrg, "searchSameThreadWindowResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchWindow,
            :schema_name => XSD::QName.new(NsWin32ServerSiriusOrg, "searchWindow"),
            :schema_element => [
              ["arg0", ["Sirius::Client::Win32::Core::Utils::Win32Locator", XSD::QName.new(nil, "arg0")], [0, 1]]
            ]
            )

            LiteralRegistry.register(
            :class => Sirius::Client::Win32::Core::Utils::SearchWindowResponse,
            :schema_name => XSD::QName.new(NsWin32ServerSiriusOrg, "searchWindowResponse"),
            :schema_element => [
              ["v_return", ["SOAP::SOAPLong", XSD::QName.new(nil, "return")]]
            ]
            )
          end

        end
      end
    end
  end
end