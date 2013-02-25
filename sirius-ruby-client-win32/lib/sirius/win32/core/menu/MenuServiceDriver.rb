require 'MenuService.rb'
require 'MenuServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Win32::Core::Menu


class Menu < ::SOAP::RPC::Driver  DefaultEndpointUrl = "http:localhost:21212/win32/menu"
  Methods = [
    [ "",
      "isMenu",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "IsMenu"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "IsMenuResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuInfo",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuInfo"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuInfoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuState",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuState"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuStateResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSubMenu",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetSubMenu"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetSubMenuResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemRect",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuItemRect"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuItemRectResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuDefaultItem",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuDefaultItem"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuDefaultItemResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemCount",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuItemCount"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuItemCountResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemID",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuItemID"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuItemIDResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuItemInfo",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuItemInfo"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuItemInfoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getMenuString",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuString"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "GetMenuStringResponse"]] ],
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
