require 'WindowService.rb'
require 'WindowServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Win32::Core::Window


class Window < ::SOAP::RPC::Driver  DefaultEndpointUrl = "http:localhost:21212/win32/window"
  Methods = [
    [ "",
      "getWindowPlacement",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getWindowPlacement"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getWindowPlacementResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSystemMenu",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getSystemMenu"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getSystemMenuResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getClientRect",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getClientRect"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getClientRectResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "doubleClick",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "doubleClick"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "doubleClickResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "keyPress",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "keyPress"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "keyPressResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getRect",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getRect"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getRectResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isMaximized",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isMaximized"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isMaximizedResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isMinimized",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isMinimized"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isMinimizedResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isUnicode",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isUnicode"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isUnicodeResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isWindow",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isWindow"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isWindowResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "sizeTo",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "sizeTo"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "sizeToResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "start",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "start"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "startResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "close",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "close"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "closeResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isVisible",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isVisible"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isVisibleResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isEnabled",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isEnabled"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isEnabledResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "keyDown",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "keyDown"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "keyDownResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "keyUp",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "keyUp"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "keyUpResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "mouseDown",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "mouseDown"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "mouseDownResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "mouseUp",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "mouseUp"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "mouseUpResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "move",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "move"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "moveResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getText",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getText"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "activate",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "activate"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "activateResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "moveTo",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "moveTo"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "moveToResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "maximize",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "maximize"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "maximizeResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "minimize",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "minimize"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "minimizeResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "restore",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "restore"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "restoreResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "click",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "click"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "clickResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenu",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenu"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isNormal",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isNormal"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isNormalResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = WindowServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = WindowServiceMappingRegistry::LiteralRegistry
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
