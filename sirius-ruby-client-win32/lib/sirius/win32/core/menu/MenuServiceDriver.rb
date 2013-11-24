require 'MenuService.rb'
require 'MenuServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Client::Win32::Core::Menu


class Menu < ::SOAP::RPC::Driver  DefaultEndpointUrl = "http:localhost:21212/win32/menu"
  Methods = [
    [ "",
      "getMenuInfo",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuInfo"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuInfoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuState",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuState"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuStateResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSubMenu",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getSubMenu"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getSubMenuResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isMenu",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isMenu"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isMenuResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "pickItem",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "pickItem"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "pickItemResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuDefaultItem",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuDefaultItem"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuDefaultItemResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemCount",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuItemCount"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuItemCountResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemID",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuItemID"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuItemIDResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemInfo",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuItemInfo"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuItemInfoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemRect",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuItemRect"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuItemRectResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuString",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuString"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getMenuStringResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = MenuServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = MenuServiceMappingRegistry::LiteralRegistry
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
