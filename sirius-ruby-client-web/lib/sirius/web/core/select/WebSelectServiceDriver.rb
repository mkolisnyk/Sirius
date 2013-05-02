# encoding: UTF-8
require 'sirius/web/core/select/WebSelectServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Client::Web::Core::Select
  class WebSelect < ::SOAP::RPC::Driver
    DefaultEndpointUrl = "http://localhost:21212/web/select"
    Methods = [
      [ "",
      "deselectAll",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "deselectAll"]],
      [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "deselectAllResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
      :response_style => :document, :response_use => :literal,
      :faults => {} }
      ],
      [ "",
      "isMultiple",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "isMultiple"]],
      [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "isMultipleResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
      :response_style => :document, :response_use => :literal,
      :faults => {} }
      ],
      [ "",
      "deselectByIndex",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "deselectByIndex"]],
      [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "deselectByIndexResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
      :response_style => :document, :response_use => :literal,
      :faults => {} }
      ],
      [ "",
      "deselectByValue",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "deselectByValue"]],
      [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "deselectByValueResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
      :response_style => :document, :response_use => :literal,
      :faults => {} }
      ],
      [ "",
      "getAllOptions",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "getAllOptions"]],
      [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "getAllOptionsResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
      :response_style => :document, :response_use => :literal,
      :faults => {} }
      ],
      [ "",
      "selectByIndex",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "selectByIndex"]],
      [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "selectByIndexResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
      :response_style => :document, :response_use => :literal,
      :faults => {} }
      ],
      [ "",
      "selectByValue",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "selectByValue"]],
      [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "selectByValueResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
      :response_style => :document, :response_use => :literal,
      :faults => {} }
      ],
      [ "",
      "selectByVisibleText",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "selectByVisibleText"]],
      [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "selectByVisibleTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
      :response_style => :document, :response_use => :literal,
      :faults => {} }
      ],
      [ "",
      "getAllSelectedOptions",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "getAllSelectedOptions"]],
      [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "getAllSelectedOptionsResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
      :response_style => :document, :response_use => :literal,
      :faults => {} }
      ],
      [ "",
      "getFirstSelectedOption",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "getFirstSelectedOption"]],
      [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "getFirstSelectedOptionResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
      :response_style => :document, :response_use => :literal,
      :faults => {} }
      ],
      [ "",
      "deselectByVisibleText",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "deselectByVisibleText"]],
      [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http://web.server.sirius.org/", "deselectByVisibleTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
      :response_style => :document, :response_use => :literal,
      :faults => {} }
      ]
    ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
      super(endpoint_url, nil)
      self.mapping_registry = WebSelectServiceMappingRegistry::EncodedRegistry
      self.literal_mapping_registry = WebSelectServiceMappingRegistry::LiteralRegistry
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
