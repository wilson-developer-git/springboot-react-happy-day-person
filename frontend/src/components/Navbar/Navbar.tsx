
import { BsInstagram } from "react-icons/all";
import { BsWhatsapp } from "react-icons/all";
import { BsFacebook } from "react-icons/all";
import { BsTwitter } from "react-icons/all";


import './Navbar.css'

export function Navbar() {
    return (
        <div>
            <nav className="nav-menu">

                <h1 className="logo-menu" >Happy Day Person

                    <div className="itens-icone-rede-social">
                        <BsInstagram className="item-icone-rede-social" />
                        <BsWhatsapp className="item-icone-rede-social" />
                        <BsFacebook className="item-icone-rede-social" />
                        <BsTwitter className="item-icone-rede-social" />
                    </div>
                </h1>
                <ul className="list-menu">
                    <li>
                        <a className="nav-link" href="#">Home</a>
                    </li>
                    <li>
                        <a className="nav-link" href="#">Services</a>
                    </li>
                    <li>
                        <a className="nav-link" href="#">Products</a>
                    </li>
                    <li>
                        <a className="nav-link" href="#">Contacts</a>
                    </li>
                    <li>
                        <a className="nav-link-signup" href="#">Sign up</a>
                    </li>
                </ul>
            </nav>
        </div>
    )
}
