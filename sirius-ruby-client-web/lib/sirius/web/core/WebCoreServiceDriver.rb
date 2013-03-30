require 'WebCoreService.rb'
require 'WebCoreServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Client::Web::Core


class WebCore < ::SOAP::RPC::Driver  DefaultEndpointUrl = "http:localhost:21212/web/core"
  Methods = [
    [ "",
      "getWindowHandle",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getWindowHandle"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getWindowHandleResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "selectFrameByName",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "selectFrameByName"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "selectFrameByNameResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "selectDefaultContent",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "selectDefaultContent"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "selectDefaultContentResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getPageSource",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getPageSource"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getPageSourceResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "selectFrameByIndex",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "selectFrameByIndex"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "selectFrameByIndexResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "back",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "back"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "backResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isDisplayed",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "isDisplayed"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "isDisplayedResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getCssValue",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getCssValue"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getCssValueResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "sendKeys",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "sendKeys"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "sendKeysResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "forward",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "forward"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "forwardResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "selectWindow",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "selectWindow"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "selectWindowResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "selectAlert",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "selectAlert"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "selectAlertResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getLocation",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getLocation"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getLocationResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getURL",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getURL"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getURLResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "clear",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "clear"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "clearResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "start",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "start"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "startResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "stop",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "stop"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "stopResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSize",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getSize"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getSizeResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "open",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "open"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "openResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "refresh",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "refresh"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "refreshResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getTitle",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getTitle"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getTitleResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isEnabled",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "isEnabled"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "isEnabledResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getText",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getText"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "submit",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "submit"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "submitResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "click",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "click"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "clickResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isSelected",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "isSelected"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "isSelectedResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getAttribute",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getAttribute"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getAttributeResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getTagName",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getTagName"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:web.server.sirius.org/", "getTagNameResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = WebCoreServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = WebCoreServiceMappingRegistry::LiteralRegistry
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
