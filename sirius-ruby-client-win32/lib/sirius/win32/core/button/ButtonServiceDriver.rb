require 'sirius/win32/core/button/ButtonService.rb'
require 'sirius/win32/core/button/ButtonServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Client::Win32::Core::Button


class Button < ::SOAP::RPC::Driver
  DefaultEndpointUrl = "http:localhost:21212/win32/button"
  Methods = [
    [ "",
      "setState",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetState"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetStateResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setCheck",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetCheck"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetCheckResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getState",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetState"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetStateResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getCheck",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetCheck"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetCheckResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = ButtonServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = ButtonServiceMappingRegistry::LiteralRegistry
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
