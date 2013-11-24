require 'ButtonService.rb'
require 'ButtonServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Client::Win32::Core::Button


class Button < ::SOAP::RPC::Driver  DefaultEndpointUrl = "http:localhost:21212/win32/button"
  Methods = [
    [ "",
      "getCheck",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getCheck"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getCheckResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isPushed",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "isPushed"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "isPushedResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isChecked",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "isChecked"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "isCheckedResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setCheck",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "setCheck"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "setCheckResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isIntermediate",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "isIntermediate"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "isIntermediateResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getState",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getState"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getStateResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setState",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "setState"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "setStateResponse"]] ],
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
