import { EntityState, EntityAdapter, createEntityAdapter } from '@ngrx/entity';

import { Cliente } from 'app/models';

import {
  ClienteActions,
  ClienteActionTypes
} from '../actions/clientes.actions';

export interface State extends EntityState<Cliente> {
  loading: boolean;
  loaded: boolean;
}

export const adapter: EntityAdapter<Cliente> = createEntityAdapter<Cliente>();

export const initialState: State = adapter.getInitialState({
  loading: false,
  loaded: false
});

export function reducer(state = initialState, action: ClienteActions): State {
  switch (action.type) {
    case ClienteActionTypes.LoadClientes: {
      return {
        ...state,
        loading: true
      };
    }
    case ClienteActionTypes.LoadClientesFail: {
      return {
        ...state,
        loading: false
      };
    }
    case ClienteActionTypes.LoadClientesSuccess: {
      return adapter.addAll(action.payload.Clientes, {
        ...state,
        loading: false,
        loaded: true
      });
    }

    default: {
      return state;
    }
  }
}

export const {
  selectIds,
  selectEntities,
  selectAll,
  selectTotal
} = adapter.getSelectors();

export const getClientesLoading = (state: State) => state.loading;
export const getClientesLoaded = (state: State) => state.loaded;
