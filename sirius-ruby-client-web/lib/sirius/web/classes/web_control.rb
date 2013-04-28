module Sirius
  module Client
    module Web
      module Classes
        class WebControl
          attr_accessor :parent
          attr_accessor :parent_element
          attr_accessor :locator

          def initialize(parent, locator, parent_element = nil)
            @parent = parent
            @parent_element = parent_element
            @locator = locator
          end

          def client
            @parent.client
          end

          def location
            client.core.getLocation(@parentElement, @locator)
          end

          def size
            client.core.getSize(@parentElement, @locator)
          end

          def focused?
            false
          end

          def click
            client.core.click(@parentElement, @locator)
          end

          def get_attribute(attribute)
            client.core.getAttribute(@parentElement, @locator, attribute)
          end

          def method_missing?(name, *args)
            get_attribute(@parentElement, @locator, name)
          end
        end
      end
    end
  end
end