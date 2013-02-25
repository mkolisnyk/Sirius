require 'Win32UtilsService.rb'
require 'Win32UtilsServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Win32::Core::Utils


class Win32Utils < ::SOAP::RPC::Driver  DefaultEndpointUrl = "http:localhost:21212/win32/utils"
  Methods = [
    [ "",
      "searchWindow",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:win32.server.sirius.org/", "searchWindow"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:win32.server.sirius.org/", "searchWindowResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "searchSameThreadWindow",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:win32.server.sirius.org/", "searchSameThreadWindow"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:win32.server.sirius.org/", "searchSameThreadWindowResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = Win32UtilsServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = Win32UtilsServiceMappingRegistry::LiteralRegistry
    init_methods
  end
private

    def init_methods
      Methods.each do |definitions|
              opt = definitions.last
              if opt[:request_style] == :document
                add_document_operation(*definitions)
              else
                add_rpc_operation(*definitions)
                qname = definitions[0]
                name = definitions[2]
                if qname.name != name and qname.name.capitalize == name.capitalize
                  ::SOAP::Mapping.define_singleton_method(self, qname.name) do |*arg|
                    __send__(name, *arg)
                  end
                end
              end
            end

  end
end

end
