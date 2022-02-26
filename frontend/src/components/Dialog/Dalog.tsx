export function Dialog(){
      
    return(
        <div>
        <dialog open>
          <form method="dialog">
            <section>
                <p>
                  <label htmlFor="favAnimal">Favorite animal:
                </label>
              <select id="favAnimal">
                <option></option>
                <option>Galinha</option>
                <option>Cachorro</option>
                <option>Gato</option>
              </select></p>
            </section>
            <menu>
              <button id="cancel" type="reset">Cancel</button>
              <button type="submit">Confirm</button>
            </menu>
          </form>
        </dialog>
        
        <menu>
          <button id="updateDetails">Update details</button>
        </menu>
    </div>
    )
}