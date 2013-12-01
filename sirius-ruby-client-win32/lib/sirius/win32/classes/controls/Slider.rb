module Sirius
  module Client
    module Win32
      module Classes
        module Controls
          class Slider < Control
            def initialize(locator, parent = nil)
              super(locator, parent)
            end

            # SYNOPSIS
            #   getLowerBound(parameters)
            #
            # ARGS
            #   parameters      GetLowerBound - {http://controls.classes.win32.server.sirius.org/}getLowerBound
            #
            # RETURNS
            #   parameters      GetLowerBoundResponse - {http://controls.classes.win32.server.sirius.org/}getLowerBoundResponse
            #
            def get_lower_bound
              @client.core.slider.getLowerBound(parameters)
            end

            # SYNOPSIS
            #   getUpperBound(parameters)
            #
            # ARGS
            #   parameters      GetUpperBound - {http://controls.classes.win32.server.sirius.org/}getUpperBound
            #
            # RETURNS
            #   parameters      GetUpperBoundResponse - {http://controls.classes.win32.server.sirius.org/}getUpperBoundResponse
            #
            def get_upper_bound
              @client.core.slider.getUpperBound(parameters)
            end

            # SYNOPSIS
            #   getPosition(parameters)
            #
            # ARGS
            #   parameters      GetPosition - {http://controls.classes.win32.server.sirius.org/}getPosition
            #
            # RETURNS
            #   parameters      GetPositionResponse - {http://controls.classes.win32.server.sirius.org/}getPositionResponse
            #
            def get_position
              @client.core.slider.getPosition(parameters)
            end

            # SYNOPSIS
            #   setPosition(parameters)
            #
            # ARGS
            #   parameters      SetPosition - {http://controls.classes.win32.server.sirius.org/}setPosition
            #
            # RETURNS
            #   parameters      SetPositionResponse - {http://controls.classes.win32.server.sirius.org/}setPositionResponse
            #
            def set_position
              @client.core.slider.setPosition(parameters)
            end
          end
        end
      end
    end
  end
end